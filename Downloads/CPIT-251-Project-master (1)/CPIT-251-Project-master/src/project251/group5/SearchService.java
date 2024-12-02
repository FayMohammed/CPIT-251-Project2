package project251.group5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

public class SearchService {
    private Repository repository;

    public SearchService(Repository repository) {
        this.repository = repository;
    }

  public List<Guide> searchByKeyword(String keyword) {
    List<Guide> results = new ArrayList<>();
    for (Guide guide : repository.getAllGuides()) {
        System.out.println("Checking: " + guide.getTitle());
        if (guide.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
            results.add(guide);
        }
    }
    return results;
}

}