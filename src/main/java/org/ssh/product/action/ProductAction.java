/**
 * 
 */
package org.ssh.product.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
 


import org.ssh.product.model.Product;
import org.ssh.product.service.ProductService;

import com.opensymphony.xwork2.ActionSupport;

/**Description: 商品操作-控制层
 * 
 * @author luwenhuang
 * @date 2017年8月3日 下午2:50:04
 */
@Controller  //将这个action交给spring管理
@Scope("prototype") //作用域 为多实例
public class ProductAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    
    @Autowired
    private ProductService productService;
    
    private String pname;
    private double price;
     
   
	/**
     * 保存商品操作
     *
     * @return
     */
    public String saveProduct() {
    	System.out.println("进入saveProduct");
    	
        Product product = new Product(pname, price);
        productService.saveProduct(product);
        
        System.out.println(pname);
        this.addActionMessage("保存成功...");
        return SUCCESS;
         
    }
 
    @Override
    public void validate() {
         
        if(pname == null || "".equals(pname.trim())) {
            this.addFieldError("pname", "商品名称不能为空");
        }
         
    }

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
    


}
