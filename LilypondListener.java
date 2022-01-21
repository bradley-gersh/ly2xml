// Generated from Lilypond.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LilypondParser}.
 */
public interface LilypondListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LilypondParser#score_file}.
	 * @param ctx the parse tree
	 */
	void enterScore_file(LilypondParser.Score_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#score_file}.
	 * @param ctx the parse tree
	 */
	void exitScore_file(LilypondParser.Score_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#book_block}.
	 * @param ctx the parse tree
	 */
	void enterBook_block(LilypondParser.Book_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#book_block}.
	 * @param ctx the parse tree
	 */
	void exitBook_block(LilypondParser.Book_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#header_block}.
	 * @param ctx the parse tree
	 */
	void enterHeader_block(LilypondParser.Header_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#header_block}.
	 * @param ctx the parse tree
	 */
	void exitHeader_block(LilypondParser.Header_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#score_block}.
	 * @param ctx the parse tree
	 */
	void enterScore_block(LilypondParser.Score_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#score_block}.
	 * @param ctx the parse tree
	 */
	void exitScore_block(LilypondParser.Score_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#staffgroup_block}.
	 * @param ctx the parse tree
	 */
	void enterStaffgroup_block(LilypondParser.Staffgroup_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#staffgroup_block}.
	 * @param ctx the parse tree
	 */
	void exitStaffgroup_block(LilypondParser.Staffgroup_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#staff_block}.
	 * @param ctx the parse tree
	 */
	void enterStaff_block(LilypondParser.Staff_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#staff_block}.
	 * @param ctx the parse tree
	 */
	void exitStaff_block(LilypondParser.Staff_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#prefix_block}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_block(LilypondParser.Prefix_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#prefix_block}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_block(LilypondParser.Prefix_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#with_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_block(LilypondParser.With_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#with_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_block(LilypondParser.With_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#voice_block}.
	 * @param ctx the parse tree
	 */
	void enterVoice_block(LilypondParser.Voice_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#voice_block}.
	 * @param ctx the parse tree
	 */
	void exitVoice_block(LilypondParser.Voice_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#note_block}.
	 * @param ctx the parse tree
	 */
	void enterNote_block(LilypondParser.Note_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#note_block}.
	 * @param ctx the parse tree
	 */
	void exitNote_block(LilypondParser.Note_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#relative_block}.
	 * @param ctx the parse tree
	 */
	void enterRelative_block(LilypondParser.Relative_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#relative_block}.
	 * @param ctx the parse tree
	 */
	void exitRelative_block(LilypondParser.Relative_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#polyphony_block}.
	 * @param ctx the parse tree
	 */
	void enterPolyphony_block(LilypondParser.Polyphony_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#polyphony_block}.
	 * @param ctx the parse tree
	 */
	void exitPolyphony_block(LilypondParser.Polyphony_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#scheme_cmd}.
	 * @param ctx the parse tree
	 */
	void enterScheme_cmd(LilypondParser.Scheme_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#scheme_cmd}.
	 * @param ctx the parse tree
	 */
	void exitScheme_cmd(LilypondParser.Scheme_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#note_cmd}.
	 * @param ctx the parse tree
	 */
	void enterNote_cmd(LilypondParser.Note_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#note_cmd}.
	 * @param ctx the parse tree
	 */
	void exitNote_cmd(LilypondParser.Note_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#bar_cmd}.
	 * @param ctx the parse tree
	 */
	void enterBar_cmd(LilypondParser.Bar_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#bar_cmd}.
	 * @param ctx the parse tree
	 */
	void exitBar_cmd(LilypondParser.Bar_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#clef_cmd}.
	 * @param ctx the parse tree
	 */
	void enterClef_cmd(LilypondParser.Clef_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#clef_cmd}.
	 * @param ctx the parse tree
	 */
	void exitClef_cmd(LilypondParser.Clef_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#fermata_cmd}.
	 * @param ctx the parse tree
	 */
	void enterFermata_cmd(LilypondParser.Fermata_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#fermata_cmd}.
	 * @param ctx the parse tree
	 */
	void exitFermata_cmd(LilypondParser.Fermata_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#key_cmd}.
	 * @param ctx the parse tree
	 */
	void enterKey_cmd(LilypondParser.Key_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#key_cmd}.
	 * @param ctx the parse tree
	 */
	void exitKey_cmd(LilypondParser.Key_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#mark_cmd}.
	 * @param ctx the parse tree
	 */
	void enterMark_cmd(LilypondParser.Mark_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#mark_cmd}.
	 * @param ctx the parse tree
	 */
	void exitMark_cmd(LilypondParser.Mark_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#tempo_cmd}.
	 * @param ctx the parse tree
	 */
	void enterTempo_cmd(LilypondParser.Tempo_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#tempo_cmd}.
	 * @param ctx the parse tree
	 */
	void exitTempo_cmd(LilypondParser.Tempo_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#time_cmd}.
	 * @param ctx the parse tree
	 */
	void enterTime_cmd(LilypondParser.Time_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#time_cmd}.
	 * @param ctx the parse tree
	 */
	void exitTime_cmd(LilypondParser.Time_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#version_cmd}.
	 * @param ctx the parse tree
	 */
	void enterVersion_cmd(LilypondParser.Version_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#version_cmd}.
	 * @param ctx the parse tree
	 */
	void exitVersion_cmd(LilypondParser.Version_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LilypondParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LilypondParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LilypondParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LilypondParser.AssignmentContext ctx);
}