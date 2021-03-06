// Generated from regularExpression.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link regularExpressionParser}.
 */
public interface regularExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link regularExpressionParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(@NotNull regularExpressionParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link regularExpressionParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(@NotNull regularExpressionParser.SymbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link regularExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull regularExpressionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link regularExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull regularExpressionParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link regularExpressionParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(@NotNull regularExpressionParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link regularExpressionParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(@NotNull regularExpressionParser.StarContext ctx);

	/**
	 * Enter a parse tree produced by {@link regularExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull regularExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link regularExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull regularExpressionParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link regularExpressionParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(@NotNull regularExpressionParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link regularExpressionParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(@NotNull regularExpressionParser.GroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link regularExpressionParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(@NotNull regularExpressionParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link regularExpressionParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(@NotNull regularExpressionParser.ConcatContext ctx);

	/**
	 * Enter a parse tree produced by {@link regularExpressionParser#altn}.
	 * @param ctx the parse tree
	 */
	void enterAltn(@NotNull regularExpressionParser.AltnContext ctx);
	/**
	 * Exit a parse tree produced by {@link regularExpressionParser#altn}.
	 * @param ctx the parse tree
	 */
	void exitAltn(@NotNull regularExpressionParser.AltnContext ctx);
}