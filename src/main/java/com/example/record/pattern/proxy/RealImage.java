package com.example.record.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author rui.zhou
 * @date 2021/05/03 15:50
 */
@Slf4j
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadFromDisk(fileName);
    }

    @Override
    public void display() {
        log.info("displaying | {}",fileName);
    }

    /**
     * 从磁盘中加载
     * @param fileName
     */
    private void loadFromDisk(String fileName){
        log.info("loading | {}",fileName);
    }

}
