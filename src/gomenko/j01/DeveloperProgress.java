package gomenko.j01;

/**
 * Created by Loner on 26.09.15.
 */
public class DeveloperProgress extends WorkOut{

    @Override
    void printTeamMate() {

        for (String name : getNameTeamMate()) {
            System.out.println(name);
        }
    }
}
