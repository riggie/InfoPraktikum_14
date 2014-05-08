import java.util.*;

public class MasterVisitor extends regularExpressionBaseVisitor<Boolean> {

	public ArrayList<Leaf> leafs = new ArrayList<Leaf>();

	
	
	@Override
	public Boolean visitStart(regularExpressionParser.StartContext ctx) { 
		return visit(ctx.altn()); 
	}
	
	@Override
	public Boolean visitAltn(regularExpressionParser.AltnContext ctx) { 
		for(regularExpressionParser.ConcatContext c : ctx.concat()) {
			visit(c);
		}		
		return true;
	}	

	@Override
	public Boolean visitConcat(regularExpressionParser.ConcatContext ctx) { 
		for(regularExpressionParser.StarredContext s : ctx.starred()) {
			visit(s);
		}		
		return true; 
	}

	@Override
	public Boolean visitStar(regularExpressionParser.StarContext ctx) { 
		visit(ctx.exp());
		return true;
	}

	@Override	
	public Boolean visitExpr(regularExpressionParser.ExprContext ctx) { 
		visit(ctx.exp());
		return true;
	}

	@Override
	public Boolean visitGroup(regularExpressionParser.GroupContext ctx) { 
		return visit(ctx.altn());
	}

	@Override
	public Boolean visitSymbol(regularExpressionParser.SymbolContext ctx) { 
		leafs.add(new Leaf(ctx.SYMB().getText()));
		return true;
	}
}
