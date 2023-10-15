package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class GUIController {

    private AddressBookRepository addressBookRepository;

    @Autowired
    public GUIController(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    @GetMapping("/display")
    public String displayGUI(@RequestParam("id") Long id, Model model) {
        model.addAttribute("id", id);
        Optional<AddressBook> addressBookOptional = addressBookRepository.findById(id);
        if (addressBookOptional.isPresent()) {
            AddressBook addressBook = addressBookOptional.get();
            List<BuddyInfo> buddies = addressBook.getBuddies();
            model.addAttribute("buddies", buddies);
            return "display";
        } else {
            return "error";
        }
    }
}
