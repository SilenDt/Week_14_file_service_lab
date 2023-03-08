package com.codeclan.lab.fileservice.contollers;

import com.codeclan.lab.fileservice.models.File;
import com.codeclan.lab.fileservice.models.Folder;
import com.codeclan.lab.fileservice.models.Person;
import com.codeclan.lab.fileservice.repositories.FileRepository;
import com.codeclan.lab.fileservice.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
        public ResponseEntity<List<File>> getAllFiles() {
            return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

}
