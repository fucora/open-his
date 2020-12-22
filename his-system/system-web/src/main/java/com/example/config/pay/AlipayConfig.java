package com.example.config.pay;

/**
 * Author jianghao
 */
public class AlipayConfig {

    //应用的ID，申请时的APPID
    public static String app_id = "2021000116676514";
    //SHA256withRsa对应支付宝公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAieD/YcVb2JXiteLp8qOywQBdQn+6spkh/n41x22bQjoHHkSvbmZCp8I6L/f7fJDdzhobaNyJk7E4YlYqWjqjwrsnDMZ55ddkgXK47afCA4t6XfBYD/85TtUIHlMCII5mFH/McpJEMciZP2U9RSqroE/7rQBQ7AbojdYCuhkS0WxuUo4HzKxKzW+odKD4ehtvi0uJY4Rynkxg6ObzT/+brGOfVWMqmRtsoBDnWGhLynGNcUpIwyPCB3sjYu7wq8+hafyjjZJZZSGrWQH5ORnsWF371hwjanTe+snxz67g0xjuonjCK1E06MxJtC9jQTgeT/h3ZQcdYGTnK9/v981zQQIDAQAB";
    //签名方式
    public static String sign_type = "RSA2";
    //字码编码格式
    public static String charset = "utf-8";
    //回调地址
    public static String notifyUrl = "http://jianghao.free.idcfengye.com/pay/callback/";

}

