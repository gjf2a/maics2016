package edu.hendrix.ev3.ai.cluster.visualize;

public enum Version {
	MAICS_1 {
		@Override
		public boolean cleanedUp() {return false;}

		@Override
		public boolean weighted() {return false;}
		
	}, MAICS_2 {
		@Override
		public boolean cleanedUp() {return false;}

		@Override
		public boolean weighted() {return true;}
		
	}, POST_MAICS {
		@Override
		public boolean cleanedUp() {return true;}

		@Override
		public boolean weighted() {return true;}
	};
	
	abstract public boolean cleanedUp();
	abstract public boolean weighted();
}
