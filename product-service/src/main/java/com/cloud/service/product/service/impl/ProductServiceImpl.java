package com.cloud.service.product.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.service.product.entity.Product;
import com.cloud.service.product.mapper.ProductMapper;
import com.cloud.service.product.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public Page<Product> getPage(Integer index) {
        Page<Product> page = new Page<>(index, 20);
        return this.page(page);
    }

    @Override
    public Product getProductById(Long id) {
        return this.getById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        this.saveOrUpdate(product);
        return product;
    }

    @Override
    public void deleteProduct(Long id) {
        this.removeById(id);
    }

    @Override
    public void addProduct(Product product) {
        this.save(product);
    }

}
