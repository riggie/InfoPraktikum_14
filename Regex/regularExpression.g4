grammar regularExpression;

start: altn EOF;
altn: concat ('|' concat)* ;
concat: starred (starred)*;
starred: exp		#expr
	| (exp '*')		#star
	;
exp: '(' altn ')'	#group
	| SYMB			#symbol
;
SYMB: [a-z1-9];
WS: [ \t\n]+ -> skip;


