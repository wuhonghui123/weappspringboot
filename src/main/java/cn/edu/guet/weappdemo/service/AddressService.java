package cn.edu.guet.weappdemo.service;

import cn.edu.guet.weappdemo.bean.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddress();
    int updateAddress(Address address);
}
