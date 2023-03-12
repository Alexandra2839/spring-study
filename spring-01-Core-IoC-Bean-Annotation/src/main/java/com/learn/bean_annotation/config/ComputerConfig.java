package com.learn.bean_annotation.config;

import com.learn.bean_annotation.casefactory.Case;
import com.learn.bean_annotation.casefactory.DellCase;
import com.learn.bean_annotation.monitorfactory.AcerMonitor;
import com.learn.bean_annotation.monitorfactory.Monitor;
import com.learn.bean_annotation.monitorfactory.SonyMonitor;
import com.learn.bean_annotation.motherboardfactory.AsusMotherboard;
import com.learn.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean(name="sony")
    public Monitor monitorSony(){

        return new SonyMonitor("25 inch Beast","Sony",25);
    }

    @Bean(name="sony2")
    public Monitor monitorSony2(){

        return new SonyMonitor("40 inch Beast","Sony",40);
    }


    @Bean
    @Primary
    public Monitor monitorAcer(){
        return new AcerMonitor("23 inch Beast","Acer",23);
    }


    @Bean
    public Case caseDell(){
        return new DellCase("220B","Dell","240");
    }

    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-200","Asus",4,6,"v2.44");
    }




}
