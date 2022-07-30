package cn.edu.guet.weappdemo.mapper;

import cn.edu.guet.weappdemo.bean.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/07/26/20:16
 */
@Mapper
public interface AddressMapper {
    List<Address> getAddress();
    int updateAddress(Address address);
    int deleteAddress(String id);
    int addAddress(Address address);
}
