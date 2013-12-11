package com.sky.test;

import com.sky.app.core.IVLXBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

/**
 * create vlx files
 * Created by yixian on 13-12-11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml", "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class VLXFileCreater {
    private static final String BASE_FOLDER = "d:/i2/";
    @Resource(name = "vlxBuilder")
    private IVLXBuilder vlxBuilder;

    @Test
    public void createVLXFiles() throws IOException {
        FileUtils.write(new File(BASE_FOLDER + "cars.vlx"), vlxBuilder.expandCarInfo(1));
        FileUtils.write(new File(BASE_FOLDER + "education.vlx"), vlxBuilder.expandEducation(1));
        FileUtils.write(new File(BASE_FOLDER + "hotelRecord.vlx"), vlxBuilder.expandHotelRecord(1));
        FileUtils.write(new File(BASE_FOLDER + "justice.vlx"), vlxBuilder.expandJustice(1));
        FileUtils.write(new File(BASE_FOLDER + "networks.vlx"), vlxBuilder.expandWebCafeRecord(1));
        FileUtils.write(new File(BASE_FOLDER + "person.vlx"), vlxBuilder.findPerson(1));
        FileUtils.write(new File(BASE_FOLDER + "personProperties.vlx"), vlxBuilder.expandPersonParams(1));
        FileUtils.write(new File(BASE_FOLDER + "reform.vlx"), vlxBuilder.expandReform(1));
        FileUtils.write(new File(BASE_FOLDER + "traffic.vlx"), vlxBuilder.expandTrafficOffences(1));
        FileUtils.write(new File(BASE_FOLDER + "volunteer.vlx"), vlxBuilder.expandVolunteer(1));
    }
}
