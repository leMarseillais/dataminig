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
			 A integer,
			 C integer,
			 D integer,
			 E integer,	 
			 F integer,
			 G integer,
			 H integer,
			 I integer,
			 K integer,
			 L integer,
			 M integer,
			 N integer,
			 P integer,
			 Q integer,
			 R integer,
			 S integer,
			 T integer,
			 V integer,
			 W integer,
			 Y integer);

create table Protein_attribute(id_attributes integer constraint id_attributes primary key,
				sequence_lenght integer);

create table General_annotation(id_general_annotation integer constraint id_general_annotation primary key,
				pathway varchar(25),
				tissue_specificity varchar(25),
				subscellular_location varchar(25),
				biophysicochemical_priopoerties varchar(25));

create table Sequence_annotation(id_seq_annotation integer constraint id_seq_annotation primary key,
				 Turn integer,
				 Helix integer,
				 Transmembrane integer,
				 Intermembrane	integer,
				 Beta_strand integer);


create table Table_de_fait(id_seq_annotation integer references Sequence_annotation,
 			  id_general_annotation integer references General_annotation,
		 	  id_attributes integer references Protein_attribute,
			  id_composition integer references Composition,
			  id_entry integer references Entry_Information primary key);








