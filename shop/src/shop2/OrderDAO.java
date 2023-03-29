package shop2;

import static shop2.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// JdbcUtill 클래스 : 드라이버로드, connection close 반복작업

public class OrderDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
//CRUD : C(create : insert) R(read : select) U(update) D(delete) 메소드 작성
	
	//장바구니 추가 ==> sorder 추가
	public boolean insert(int userId,int productId) {
		boolean status = false;
		try {
			con = getConnection();
			String sql="insert into sorder(order_id,user_id,product_id,order_date) values(order_seq.nextval,?,?,sysdate)"; 
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, productId);

			int result = pstmt.executeUpdate();

			if(result>0) status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//장바구니 조회 - 특정 회원
	public List<OrderDTO> carts(int userId){
		List<OrderDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = " select s.user_id, u.name, t.info, p.product_id, p.pname, p.price, p.content, s.order_date "
					+ "from sorder s, product p, suser u, paytype t "
					+ "where s.user_id=u.user_id and u.pay_no=t.pay_no and s.product_id=p.product_id and s.user_id=?";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,userId);
			rs=pstmt.executeQuery();
			
			// ResultSet 결과 : user_id, name, info, product_id, pname, price, content) =>OrderDTO담기
			// UserDTO : user_id, name, info
			// Product : product_id, pname, price, content
			//           order_date
			
			while(rs.next()) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(rs.getInt(1));
				userDTO.setName(rs.getString(2));
				userDTO.setType(rs.getString(3));
				
				ProductDTO productDTO=new ProductDTO();
				productDTO.setProduct_id(rs.getInt(4));
				productDTO.setPname(rs.getString(5));
				productDTO.setPrice(rs.getInt(6));
				productDTO.setContent(rs.getString(7));
				
				
				OrderDTO orderDTO=new OrderDTO();
				orderDTO.setUserDTO(userDTO);
				orderDTO.setProductDTO(productDTO);
				orderDTO.setOrder_date(rs.getDate(8));
				
				list.add(orderDTO);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
		
		
		
	}
	
	
}
