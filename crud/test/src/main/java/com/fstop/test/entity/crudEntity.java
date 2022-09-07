package com.fstop.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

//entity其實就是本體的意思,其實就是指我實際的欄位



import lombok.Data;
//這邊要注意,因為我是要用lombak方式去做,所以要先確定lombak有正常吃到@@
//如果要用restful 或是用intelj跑的話,用的東西不一樣

@Data
@Table(name="stroed_1")
//資料庫是for_crud,這邊SQL的表單名稱叫stroed_1
@Entity
public class crudEntity {
	@Id
	@Column(name="Id")
	private String Id;
	//還沒找到可以用int的方法,因為功能大部分都是吃String,估計驗證也不是直接用SQL型別驗的...
	
	@Column(name="username")
	private String username; 
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
//	@Column(name="create_time")
//	private String create_time;
	
	
}
