package thread;

	public class User2 extends Thread {
		//calculator 포함관계
		private Calculator cal;
		
		
		
		
		public User2(Calculator cal) {
			super();
			this.cal = cal;
			setName("User2");
		}




		@Override
		public void run() {
			cal.setMemory(50);
		}

}
