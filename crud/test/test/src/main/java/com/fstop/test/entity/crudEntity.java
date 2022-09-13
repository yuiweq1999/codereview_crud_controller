package com.fstop.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//entity其實就是本體的意思,其實就是指我實際的欄位



//import lombok.Data;
//這邊要注意,因為我是要用lombak方式去做,所以要先確定lombak有正常吃到@@
//如果要用restful 或是用intelj跑的話,用的東西不一樣

@Data
@AllArgsConstructor
@NoArgsConstructor
//不管有引數無引數的建構子都必須要記得從lombak叫出來,不然new物件就會找不到建構子(無引數也一樣會找不到無引數的建構子@@)
@Table(name="stroed_1")
//資料庫是for_crud,這邊SQL的表單名稱叫stroed_1
@Entity
public class crudEntity {
	
	@Id
	@Column(name="id")
	private String id;
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
