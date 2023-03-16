package inter;

public class DaoEx {
	public static void main(String[] args) {
		DataAccessObject oracle=new OracleDao();
		dbWork(oracle);
		
		Mysql mysql=new Mysql();
		dbWork(mysql);
	}
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
		
//	static void dbWork2(OracleDao orcle) {
//		orcle.select();
//		orcle.insert();
//		orcle.update();
//		orcle.delete();
//	}
}
