package com.li.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author mnli
 * @date 2022/11/20 20:06
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User implements Serializable {
    String name;
}
