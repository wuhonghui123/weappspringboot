package cn.edu.guet.weappdemo.service.impl;

import cn.edu.guet.weappdemo.bean.Address;
import cn.edu.guet.weappdemo.mapper.AddressMapper;
import cn.edu.guet.weappdemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public List<Address> getAddress() {
        return addressMapper.getAddress();
    }

    @Override
    public int updateAddress(Address address) {
        return addressMapper.updateAddress(address);
    }

    @Override
    public int deleteAddress(String id) {
        return addressMapper.deleteAddress(id);
    }

    @Override
    public int addAddress(Address address) {
        return addressMapper.addAddress(address);
    }


}
