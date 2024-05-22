public class LeagueMain {
    public static void main(String[] args) {
        SingleLinkedList league = new SingleLinkedList();

        league.addTeam(new Team("Arsenal"));
        league.addTeam(new Team("Aston Villa"));
        league.addTeam(new Team("Bournemouth"));
        league.addTeam(new Team("Brentford"));
        league.addTeam(new Team("Brighton And Hove Albion"));
        league.addTeam(new Team("Burnley"));
        league.addTeam(new Team("Chelsea"));
        league.addTeam(new Team("Crystal Palace"));
        league.addTeam(new Team("Everton"));
        league.addTeam(new Team("Fulham"));
        league.addTeam(new Team("Liverpool"));
        league.addTeam(new Team("Luton Town"));
        league.addTeam(new Team("Manchester City"));
        league.addTeam(new Team("Manchester United"));
        league.addTeam(new Team("Newcastle United"));
        league.addTeam(new Team("Nottingham Forest"));
        league.addTeam(new Team("Sheffield United"));
        league.addTeam(new Team("Tottenham Hotspur"));
        league.addTeam(new Team("West Ham United"));
        league.addTeam(new Team("Wolverhampton Wanderers"));

        String[] namaTeam = { // meyimpan nama team untuk keperluan proses addHasilTanding() 
            "Arsenal", "Aston Villa", "Bournemouth", "Brentford", "Brighton And Hove Albion",
            "Burnley", "Chelsea", "Crystal Palace", "Everton", "Fulham", "Liverpool",
            "Luton Town", "Manchester City", "Manchester United", "Newcastle United",
            "Nottingham Forest", "Sheffield United", "Tottenham Hotspur", "West Ham United", "Wolverhampton Wanderers"
        };

        for (int i=0; i < namaTeam.length; i++) {
            for (int j= i+1; j < namaTeam.length; j++) {
                int scoreA = (int)(Math.random() * 5); // skor acak maksimal 4
                int scoreB = (int)(Math.random() * 5);
                league.addHasilTanding(namaTeam[i], scoreA, namaTeam[j], scoreB);
            }
        }

        league.sortingTeam();
        league.print();
    }
}

class SingleLinkedList {
    Team head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Team tmp = head;
            int rank = 1;

            System.out.println("===============================================================================");
            System.out.println("England Premier League \t\t\t\t    Musim: 2023/24");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("%-12s %-30s %-3s %-3s %-3s %-3s %-3s %-3s %-6s %-3s \n",
                    "Peringkat", "Nama Team", "T", "M", "S", "K", "GM", "GK", "SG", "Poin");
            System.out.println("-------------------------------------------------------------------------------");

            while (tmp != null) {
                System.out.printf("%-12s %-30s %-3s %-3s %-3s %-3s %-3s %-3s %-6s %-3s \n",
                        rank, tmp.nama, tmp.tanding, tmp.menang, tmp.seri, tmp.kalah, tmp.goalMemasukkan, tmp.goalKebobolan, tmp.selisihGoal(), tmp.point);
                tmp = tmp.next;
                rank++;
            }

            System.out.println("------------------------------------------------------------------------------\n");
            System.out.println("Keterangan");
            System.out.println("----------------------");
            System.out.printf("%-2s | %-15s \n", "T", "Tanding");
            System.out.printf("%-2s | %-15s \n", "M", "Menang");
            System.out.printf("%-2s | %-15s \n", "S", "Seri");
            System.out.printf("%-2s | %-15s \n", "K", "Kalah");
            System.out.printf("%-2s | %-15s \n", "GM", "Goal Memasukkan");
            System.out.printf("%-2s | %-15s \n", "GK", "Goal Kebobolan");
            System.out.printf("%-2s | %-15s \n", "SG", "Selisih Goal");
        } else {
            System.out.println("Klasemen kosong!");
        }
    }

    void addTeam(Team team) {
        if (isEmpty()) {
            head = team;
            tail = team;
        } else {
            tail.next = team;
            tail = team;
        }
    }

    void addHasilTanding(String namaTeamA, int scoreA, String namaTeamB, int scoreB) {
        Team teamA = findTeam(namaTeamA);
        Team teamB = findTeam(namaTeamB);

        if (teamA != null && teamB != null) {
            teamA.tanding++;
            teamB.tanding++;

            teamA.goalMemasukkan += scoreA;
            teamA.goalKebobolan += scoreB;
            teamB.goalMemasukkan += scoreB;
            teamB.goalKebobolan += scoreA;

            if (scoreA > scoreB) {
                teamA.menang++;
                teamB.kalah++;
                teamA.point += 3;
            } else if (scoreA < scoreB) {
                teamB.menang++;
                teamA.kalah++;
                teamB.point += 3;
            } else {
                teamA.seri++;
                teamB.seri++;
                teamA.point++;
                teamB.point++;
            }
        }
    }

    Team findTeam(String nama) {
        Team tmp = head;
        while (tmp != null) {
            if (tmp.nama.equals(nama)) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }

    void sortingTeam() {
        if (head == null || head.next == null) {
            return;
        }

        Team sorted = null;

        while (head != null) {
            Team current = head;
            head = head.next;

            if (sorted == null || compareTeam(current, sorted) > 0) {
                current.next = sorted;
                sorted = current;
            } else {
                Team temp = sorted;
                while (temp.next != null && compareTeam(current, temp.next) <= 0) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
        }
        head = sorted;
    }

    int compareTeam(Team a, Team b) {
        if (a.point != b.point) {
            return a.point - b.point;
        } else {
            return a.selisihGoal() - b.selisihGoal();
        }
    }
}

class Team {
    String nama;
    int tanding, menang, seri, kalah,
        goalMemasukkan, goalKebobolan, point;
    Team next;

    Team(String nama) {
        this.nama = nama;
        this.tanding = 0;
        this.menang = 0;
        this.seri = 0;
        this.kalah = 0;
        this.goalMemasukkan = 0;
        this.goalKebobolan = 0;
        this.point = 0;
        this.next = null;
    }

    int selisihGoal() {
        return goalMemasukkan - goalKebobolan;
    }
}
