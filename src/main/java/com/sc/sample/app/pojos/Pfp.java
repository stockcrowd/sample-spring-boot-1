package com.sc.sample.app.pojos;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Pfp {
	
    String name;
    Integer registerNumber;
    String registerDate;
    String webpage;
}
