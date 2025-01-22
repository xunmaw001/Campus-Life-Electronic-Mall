package com.entity.vo;

import com.entity.CantingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 餐厅信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-12 17:53:58
 */
public class CantingxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐厅类型
	 */
	
	private String cantingleixing;
		
	/**
	 * 餐厅图片
	 */
	
	private String cantingtupian;
		
	/**
	 * 菜品名称
	 */
	
	private String caipinmingcheng;
		
	/**
	 * 菜品类型
	 */
	
	private String caipinleixing;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 餐厅地址
	 */
	
	private String cantingdizhi;
		
	/**
	 * 菜品介绍
	 */
	
	private String caipinjieshao;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：餐厅类型
	 */
	 
	public void setCantingleixing(String cantingleixing) {
		this.cantingleixing = cantingleixing;
	}
	
	/**
	 * 获取：餐厅类型
	 */
	public String getCantingleixing() {
		return cantingleixing;
	}
				
	
	/**
	 * 设置：餐厅图片
	 */
	 
	public void setCantingtupian(String cantingtupian) {
		this.cantingtupian = cantingtupian;
	}
	
	/**
	 * 获取：餐厅图片
	 */
	public String getCantingtupian() {
		return cantingtupian;
	}
				
	
	/**
	 * 设置：菜品名称
	 */
	 
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
				
	
	/**
	 * 设置：菜品类型
	 */
	 
	public void setCaipinleixing(String caipinleixing) {
		this.caipinleixing = caipinleixing;
	}
	
	/**
	 * 获取：菜品类型
	 */
	public String getCaipinleixing() {
		return caipinleixing;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：餐厅地址
	 */
	 
	public void setCantingdizhi(String cantingdizhi) {
		this.cantingdizhi = cantingdizhi;
	}
	
	/**
	 * 获取：餐厅地址
	 */
	public String getCantingdizhi() {
		return cantingdizhi;
	}
				
	
	/**
	 * 设置：菜品介绍
	 */
	 
	public void setCaipinjieshao(String caipinjieshao) {
		this.caipinjieshao = caipinjieshao;
	}
	
	/**
	 * 获取：菜品介绍
	 */
	public String getCaipinjieshao() {
		return caipinjieshao;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
