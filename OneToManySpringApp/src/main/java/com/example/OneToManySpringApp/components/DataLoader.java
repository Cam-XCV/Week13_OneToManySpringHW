package com.example.OneToManySpringApp.components;

import com.example.OneToManySpringApp.models.User;
import com.example.OneToManySpringApp.models.Folder;
import com.example.OneToManySpringApp.models.File;
import com.example.OneToManySpringApp.repositories.FileRespository;
import com.example.OneToManySpringApp.repositories.FolderRepository;
import com.example.OneToManySpringApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRespository fileRespository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {

        User user1 = new User("Legolas");
        User user2 = new User("Gandalf");
        User user3 = new User("Frodo");                     // i'm watching lotr :)
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        Folder folder1 = new Folder("Elf Stuff", user1);
        Folder folder2 = new Folder("Wizard Stuff", user2);
        Folder folder3 = new Folder("Hobbit Stuff", user3);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);

        File file1 = new File("Pointy Ears 101", "txt", 10, folder1);
        File file2 = new File("HD Shadowfax Wallpaper", "jpeg", 50, folder2);
        File file3 = new File("Why We Should Have Multiple Breakfasts", "ppt", 20, folder3);
        File file4 = new File("Bow Tier List", "xlsx", 10, folder1);
        File file5 = new File("Haircare Routine", "txt", 5, folder2);
        File file6 = new File("How To Look Taller", "txt", 30, folder3);
        fileRespository.save(file1);
        fileRespository.save(file2);
        fileRespository.save(file3);
        fileRespository.save(file4);
        fileRespository.save(file5);
        fileRespository.save(file6);


    }
}
