package com.example.controller.erp;

import com.example.aspectj.annotation.Log;
import com.example.aspectj.enums.BusinessType;
import com.example.controller.BaseController;
import com.example.dto.ProducterDto;
import com.example.service.ProducterService;
import com.example.utils.ShiroSecurityUtils;
import com.example.vo.AjaxResult;
import com.example.vo.DataGridView;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Auther jianghao
 * 生产厂家控制器
 */
@RestController
@RequestMapping("/erp/producter")
public class ProducterController  extends BaseController {

    @Reference//使用duboot的引用
    private ProducterService producterService;

    /**
     * 分页查询
     */
    @GetMapping("/listProducterForPage")
    @HystrixCommand
    public AjaxResult listProducterForPage(ProducterDto producterDto){
        DataGridView gridView = this.producterService.listProducterPage(producterDto);
        return AjaxResult.success("查询成功",gridView.getData(),gridView.getTotal());
    }
    /**
     * 添加
     */
    @PostMapping("/addProducter")
    @HystrixCommand
    @Log(title = "添加生产厂家",businessType = BusinessType.INSERT)
    public AjaxResult addProducter(@Validated ProducterDto producterDto) {
        producterDto.setSimpleUser(ShiroSecurityUtils.getCurrentSimpleUser());
        return AjaxResult.toAjax(this.producterService.addProducter(producterDto));
    }

    /**
     * 修改
     */
    @PutMapping("/updateProducter")
    @HystrixCommand
    @Log(title = "修改生产厂家",businessType = BusinessType.UPDATE)
    public AjaxResult updateProducter(@Validated ProducterDto producterDto) {
        producterDto.setSimpleUser(ShiroSecurityUtils.getCurrentSimpleUser());
        return AjaxResult.toAjax(this.producterService.updateProducter(producterDto));
    }


    /**
     * 根据ID查询一个生产厂家信息
     */
    @GetMapping("/getProducterById/{producterId}")
    @HystrixCommand
    public AjaxResult getProducterById(@PathVariable @Validated @NotNull(message = "生产厂家ID不能为空") Long producterId) {
        return AjaxResult.success(this.producterService.getOne(producterId));
    }

    /**
     * 删除
     */
    @DeleteMapping("/deleteProducterByIds/{producterIds}")
    @HystrixCommand
    @Log(title = "删除生产厂家",businessType = BusinessType.DELETE)
    public AjaxResult deleteProducterByIds(@PathVariable @Validated @NotEmpty(message = "要删除的ID不能为空") Long[] producterIds) {
        return AjaxResult.toAjax(this.producterService.deleteProducterByIds(producterIds));
    }

    /**
     * 查询所有可用的生产厂家
     */
    @GetMapping("/selectAllProducter")
    @HystrixCommand
    public AjaxResult selectAllProducter() {
        return AjaxResult.success(this.producterService.selectAllProducter());
    }

}

