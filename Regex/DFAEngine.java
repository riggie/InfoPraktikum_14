import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class DFAEngine {
	ArrayList<Leaf> leafs;
	public DFAEngine(ParseTree tree, String text) {
		MasterVisitor m = new MasterVisitor();
		m.visit(tree);
		this.leafs = m.leafs;
	}

	public MatchingResult run() {	
		// to implement (replace dummy return)
		for(Leaf l : leafs) {
			System.out.println(l.getLeaf());
		}
		return new MatchingResult(-1,"");
	}
		

}
