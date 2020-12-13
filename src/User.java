public class User {
	private String jmeno;
	private String prijmeni;
	private boolean pohlavi;
	private int vek;
	private int cislo;
	private String heslo;
	private String nick;

	private User(Builderpattern pt){
		jmeno = pt.jmeno;
		prijmeni = pt.prijmeni;
		vek = pt.vek;
		pohlavi = pt.pohlavi;
		cislo = pt.cislo;
		nick = pt.nick;
		heslo = pt.heslo;
	}

	public static class Builderpattern {
		private String jmeno;
		private String prijmeni;
		private int vek;
		private boolean pohlavi;
		private int cislo;
		private String heslo;
		private String nick;

		public Builderpattern jmeno(String jmeno){
			this.jmeno = jmeno;
			return this;
		}

		public Builderpattern prijmeni(String prijmeni){
			this.prijmeni = prijmeni;
			return this;
		}

		public Builderpattern(String nick, String heslo){
			this.nick = nick;
			this.heslo = heslo;
		}

		public Builderpattern vek(int vek){
			this.vek = vek;
			return this;
		}

		public Builderpattern cislo(int cislo){
			this.cislo = cislo;
			return this;
		}

		public Builderpattern pohlavi(boolean pohlavi){
			this.pohlavi = pohlavi;
			return this;
		}
	}
}
