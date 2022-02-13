package BaiTap;

import _12_Java_Collection_Framework.bai_tap.luyen_tap_sd_ArrayList_LinkedList_trg_JVCollectionFramework.Product;

import java.util.ArrayList;
import java.util.List;

public class CandidateManager {
    private List<Candidate> candidates = new ArrayList<>();

    public void create (Candidate candidate) {
        candidate.setId(candidates.size() + 1);
        candidates.add(candidate);
    }

    public List<Candidate> getAll(){
        return candidates;
    }
}
