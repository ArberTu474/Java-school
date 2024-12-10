import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VotingMachineTest {

  @Test
  public void countVotes() {
    VotingMachine machine = new VotingMachine();

    machine.voteDemocrats();
    machine.voteDemocrats();
    machine.voteDemocrats();
    machine.voteRepublicans();
    machine.voteRepublicans();
    machine.voteRepublicans();
    machine.voteRepublicans();

    assertEquals(3, machine.getDemocratVotes());
    assertEquals(4, machine.getRepublicanVotes());
  }
}
