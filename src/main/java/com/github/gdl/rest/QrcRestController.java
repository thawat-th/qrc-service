package com.github.gdl.rest;

import com.github.gdl.builders.Qrc;
import com.github.gdl.builders.QrcBuilder;
import com.github.gdl.dto.QrcDto;
import com.google.zxing.WriterException;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping(value = "/v1/qrc")
@Slf4j
@CrossOrigin(origins = "*")
public class QrcRestController {

    @PostMapping("/write")
    @ApiOperation(value = "Renders a QR Code")
    public ResponseEntity<BufferedImage> write(
            @RequestBody QrcDto qr) throws WriterException {
        Qrc qrc = new QrcBuilder(qr).build();
        int width = qr.getMatrix().getWidth();
        int height = qr.getMatrix().getHeight();
        BufferedImage image = qrc.writeToImage(width, height);
        log.info("image: [{}]", image.toString());
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

    @GetMapping("/write/{content}")
    @ApiOperation(value = "Renders a QR Code with Content")
    public ResponseEntity<BufferedImage> write(
            @PathVariable String content,
            @RequestParam(value = "width", defaultValue = "400") int width,
            @RequestParam(value = "height", defaultValue = "400") int height) throws WriterException {
        Qrc qrc = new Qrc(content);
        BufferedImage image = qrc.writeToImage(width, height);
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

}
