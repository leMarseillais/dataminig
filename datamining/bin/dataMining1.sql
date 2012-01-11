drop table Entry_Information cascade;
drop table Composition cascade;
drop table Protein_attribute cascade;
drop table Domain cascade;
drop table Function cascade;
drop table General_annotation cascade;
drop table Sequence_annotation cascade;
drop table Table_de_fait cascade;


create table Entry_Information(id_entry integer constraint id_entry primary key,
				Entry_name varchar(50));

create table Composition(id_composition integer constraint id_composition primary key,
			 A smallint,
			 C smallint,
			 D smallint,
			 E smallint,	 
			 F smallint,
			 G smallint,
			 H smallint,
			 I smallint,
			 K smallint,
			 L smallint,
			 M smallint,
			 N smallint,
			 P smallint,
			 Q smallint,
			 R smallint,
			 S smallint,
			 T smallint,
			 V smallint,
			 W smallint,
			 Y smallint);

create table Protein_attribute(id_attributes integer constraint id_attributes primary key,
				sequence_lenght integer);

create table Domain(id_domain integer constraint id_domain primary key,
		    name varchar(25));

create table Function(id_function integer constraint id_function primary key,
			function varchar(25),
			catalytic_activity varchar(25));

create table General_annotation(id_general_annotation integer constraint id_general_annotation primary key,
				pathway varchar(25),
				tissue_specificity varchar(25),
				subscellular_location varchar(25),
				biophysicochemical_priopoerties varchar(25));

create table Sequence_annotation(id_seq_annotation integer constraint id_seq_annotation primary key,
				 Turn smallint,
				 Helix smallint,
				 Site smallint,
				 Transmembrane smallint,
				 Intermembrane	smallint,
				 Chain smallint,
				 Beta_strand smallint);


create table Table_de_fait(id_seq_annotation integer references Sequence_annotation,
 			  id_general_annotation integer references General_annotation,
			  id_function integer references Function,
			  id_domain integer references Domain,
		 	  id_attributes integer references Protein_attribute,
			  id_composition integer references Composition,
			  id_entry integer references Entry_Information,
			  PRIMARY KEY (id_entry));








