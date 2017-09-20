package org.ssh.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;

/**Description: 商品的实体类
 * 
 * @author luwenhuang
 * @date 2017年8月3日 下午2:48:35
 * 
 */
@Entity(name="tb_product")  //注释将此类标记为实体。
public class Product {
	
    @Id  //注释标记此实体的标识符
    @GeneratedValue(generator = "pid")  //写明使用哪个序列生成器
    @GenericGenerator(name = "pid", strategy = "native")  //写明使用哪个序列生成器
    private int pid;// 商品ID
    @Column(length = 200)  //标明字条长度为100
    private String pname;// 商品名称
    private double price;// 商品价格


    public Product() {
        
    }
         
    public Product(String pname, double price) {
     
        this.pname = pname;
        this.price = price;
             
    }
    
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
