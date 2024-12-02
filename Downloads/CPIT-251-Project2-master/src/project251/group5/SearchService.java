package project251.group5;

/*
 elaf 2105887
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