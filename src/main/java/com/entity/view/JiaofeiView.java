package com.entity.view;

import com.entity.JiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 缴费表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-05
 */
@TableName("jiaofei")
public class JiaofeiView extends JiaofeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 缴费类型的值
		*/
		private String jiaofeiValue;
		/**
		* 是否缴费的值
		*/
		private String shifouValue;



		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuXuehao;
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 学生性别
			*/
			private Integer sexTypes;
				/**
				* 学生性别的值
				*/
				private String sexValue;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生照片
			*/
			private String yonghuPhoto;

	public JiaofeiView() {

	}

	public JiaofeiView(JiaofeiEntity jiaofeiEntity) {
		try {
			BeanUtils.copyProperties(this, jiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 缴费类型的值
			*/
			public String getJiaofeiValue() {
				return jiaofeiValue;
			}
			/**
			* 设置： 缴费类型的值
			*/
			public void setJiaofeiValue(String jiaofeiValue) {
				this.jiaofeiValue = jiaofeiValue;
			}
			/**
			* 获取： 是否缴费的值
			*/
			public String getShifouValue() {
				return shifouValue;
			}
			/**
			* 设置： 是否缴费的值
			*/
			public void setShifouValue(String shifouValue) {
				this.shifouValue = shifouValue;
			}














				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuXuehao() {
						return yonghuXuehao;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuXuehao(String yonghuXuehao) {
						this.yonghuXuehao = yonghuXuehao;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 学生性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 学生性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 学生性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 学生性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}


}
