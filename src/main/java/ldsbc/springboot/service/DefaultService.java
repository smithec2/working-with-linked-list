package ldsbc.springboot.service;

import ldsbc.springboot.model.LinkedListResults;
import org.springframework.stereotype.*;

import java.util.LinkedList;

/**
 * Created by CSmith on 3/8/2017.
 */
@org.springframework.stereotype.Service
public class DefaultService implements Service {
  
  @Override
  public LinkedListResults useLinkedList(String textIn) {
    LinkedList<String> linkedList = new LinkedList<>();
    LinkedListResults results = new LinkedListResults();
    // parse textIn on white space
    // add each element to linked list
    // Add results to LinkedListResults
    
    // Find size
    results.setSize(999);
    // First element
    // Last element
    // Element after first element
    // Second to last element
    return results;
  }
}
