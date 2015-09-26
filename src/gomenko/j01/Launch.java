package gomenko.j01;

/**
 * Created by Loner on 26.09.15.
 */
public class Launch {

    public static void main(String[] args) {
        DeveloperProgress developerProgress = new DeveloperProgress();
        System.out.println(developerProgress.getSuccesfullProjName());
        developerProgress.printTeamMate();
        QAProgress qaProgress = new QAProgress();
        System.out.println(qaProgress.getSuccesfullTestCount());
        qaProgress.printTeamMate();
    }
}
