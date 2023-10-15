package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    /*
    @Bean
    public CommandLineRunner demo(AddressBookRepository repository, BuddyInfoRepository buddyInfoRepository) {
        return (args) -> {

            BuddyInfo b1 = new BuddyInfo("Cristiano", "7");
            BuddyInfo b2 = new BuddyInfo("Mbappe", "10");
            BuddyInfo b3 = new BuddyInfo("Zidane", "5");

            AddressBook ab = new AddressBook();
            ab.addBuddy(b1);
            ab.addBuddy(b2);
            ab.addBuddy(b3);

            repository.save(ab);

            log.info("Address book found with FindAll():");
            log.info("----------------------------------");
            for(AddressBook addressBook: repository.findAll()) {
                for(BuddyInfo buddyInfo: addressBook.getBuddies()) {
                    log.info(buddyInfo.toString());
                }
            }
            log.info("");

            buddyInfoRepository.save(new BuddyInfo("Mahrez", "26"));
            buddyInfoRepository.save(new BuddyInfo("Saint Max", "10"));

            log.info("Buddy Info findByName()");
            log.info("----------------------------------");
            for(BuddyInfo buddyInfo: buddyInfoRepository.findByName("Saint Max")) {
                log.info(buddyInfo.toString());
            }
            log.info("");



        };
    }

     */

}