package ldsbc.springboot.service;

import ldsbc.springboot.model.LinkedListResults;

/**
 * Created by CSmith on 3/21/2017.
 */
public interface Service {
  
  /**
   *
   * @param textIn
   * @return
   */
  LinkedListResults useLinkedList(String textIn);
}
