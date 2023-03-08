package com.codeclan.lab.fileservice.components;

import com.codeclan.lab.fileservice.models.File;
import com.codeclan.lab.fileservice.models.Folder;
import com.codeclan.lab.fileservice.models.Person;
import com.codeclan.lab.fileservice.repositories.FileRepository;
import com.codeclan.lab.fileservice.repositories.FolderRepository;
import com.codeclan.lab.fileservice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {};

    public void run(ApplicationArguments args) {

        Person eilidh = new Person("Eilidh");
        personRepository.save(eilidh);

        Person jayde = new Person("Jayde");
        personRepository.save(jayde);

        Folder pet = new Folder("pet", eilidh);
        folderRepository.save(pet);

        File dog = new File("dog", "ext", 20, pet);

    }
}
