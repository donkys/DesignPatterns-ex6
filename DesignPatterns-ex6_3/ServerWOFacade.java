public class ServerWOFacade {
	public static void main(String[] args) {
		FacadeSchedule schedule = FacadeSchedule.getFacadeObj();
		schedule.startProcess();
		schedule.stopProcess();
	}
}
