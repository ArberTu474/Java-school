// Implement a VotingMachine class that can be used for a simple election. Have meth­ods
// to clear the machine state, to vote for a Democrat, to vote for a Republican, and to
// get the tallies for both parties.

public class VotingMachine {
  private int republicanVotes;
  private int democratVotes;

  public VotingMachine() {
    republicanVotes = 0;
    democratVotes = 0;
  }

  public int getRepublicanVotes() {
    return republicanVotes;
  }

  public int getDemocratVotes() {
    return democratVotes;
  }

  public void voteRepublicans() {
    republicanVotes++;
  }

  public void voteDemocrats() {
    democratVotes++;
  }
}
