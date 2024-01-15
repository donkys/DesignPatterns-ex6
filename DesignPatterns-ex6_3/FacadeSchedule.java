public class FacadeSchedule {
    private static FacadeSchedule myFacadeObj = new FacadeSchedule();

    private FacadeSchedule() {
    }

    public void startProcess() {
        ScheduleServer obj = new ScheduleServer();
        obj.startBooting();
        obj.readSystemConfigFile();
        obj.init();
        obj.initializeContext();
        obj.initializeListeners();
        obj.createSystemObjects();
        System.out.println("Start working......");
    }

    public void stopProcess() {
        System.out.println("After work done.........");
        ScheduleServer obj = new ScheduleServer();
        obj.releaseProcesses();
        obj.destory();
        obj.destroySystemObjects();
        obj.destoryListeners();
        obj.destoryContext();
        obj.shutdown();
    }

    public static FacadeSchedule getFacadeObj() {
        return myFacadeObj;
    }

}
