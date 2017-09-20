/**
 * 
 */
package org.ssh.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.product.dao.ProductDao;
import org.ssh.product.model.Product;
import org.ssh.product.service.ProductService;

/**Description: 商品信息-服务层实现
 * 
 * @author luwenhuang
 * @date 2017年8月3日 下午5:31:33
 */
@Service  
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

	/* (non-Javadoc)
	 * @see org.ssh.product.service.ProductService#saveProduct(org.ssh.product.model.Product)
	 */
	public void saveProduct(Product product) {
		productDao.saveProduct(product);

	}

}
