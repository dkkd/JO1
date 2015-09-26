package gomenko.j01;

enum TeamMateName {

    DEV_NAME("Alex"),
    DEV_NAME2("Alex"),
    DEV_NAME3("Stas");

    private String name;

    TeamMateName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

/**
 * Created by Loner on 26.09.15.
 */
public abstract class WorkOut implements QATeam, DeveloperTeam {

   abstract void printTeamMate();

    @Override
    public String getSuccesfullProjName() {

        return "ROYAL";
    }

    @Override
    public int getSuccesfullTestCount() {

        return 3;
    }

    @Override
    public String [] getNameTeamMate() {
        int i = 0;
        String [] arrayName = new String[3];

        for (TeamMateName teamName : TeamMateName.values()) {
            arrayName[i] = teamName.getName();
            i++;
        }

        return arrayName;
    }
}

