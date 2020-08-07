package com.github.gdl.rest;

import com.github.gdl.builders.QrcBuilder;
import com.github.gdl.dto.QrcDto;
import com.google.zxing.WriterException;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping(value = "/v1/qrc")
@Slf4j
@CrossOrigin(origins = "*")
public class QrcRestController {

    @PostMapping("/write")
    @Operation(summary = "Renders a QR Code")
    public ResponseEntity<BufferedImage> write(
            @RequestBody QrcDto qr) throws WriterException {
        QrcBuilder builder = QrcBuilder.builder().qrc(qr).build();
        BufferedImage image = builder.writeToImage();
        log.info("image: [{}]", image.toString());
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity<>(image, headers, HttpStatus.OK);
    }

    @GetMapping("/write/{content}")
    @Operation(summary = "Renders a QR Code with Content")
    public ResponseEntity<BufferedImage> write(
            @PathVariable String content,
            @RequestParam(value = "width", defaultValue = "400") int width,
            @RequestParam(value = "height", defaultValue = "400") int height) throws WriterException {
        QrcBuilder builder = QrcBuilder.builder().content(content).build();
        BufferedImage image = builder.writeToImage(width, height);
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity<>(image, headers, HttpStatus.OK);
    }

}
