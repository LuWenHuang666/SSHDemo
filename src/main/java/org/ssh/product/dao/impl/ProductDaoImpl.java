/**
 * 
 */
package org.ssh.product.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.ssh.product.dao.ProductDao;
import org.ssh.product.model.Product;

/**Description: 商品信息-服务层实现
 * 
 * @author luwenhuang
 * @date 2017年8月3日 下午5:25:17
 */
@Repository   // 首先使用 @Repository 将 DAO 类声明为 Bean 
public class ProductDaoImpl implements ProductDao {

    private HibernateTemplate template;
    
    @Autowired
    public ProductDaoImpl(SessionFactory sessionFactory) {
         
        template = new HibernateTemplate(sessionFactory);
         
    }
    
	/* (non-Javadoc)
	 * @see org.ssh.product.dao.ProductDao#saveProduct(org.ssh.product.model.Product)
	 */
	public void saveProduct(Product product) {
		template.save(product);

	}

}
