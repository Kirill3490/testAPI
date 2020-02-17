INSERT INTO public.director(
	id, first_name, last_name, birth_date)
	VALUES 
	(1, 'James', 'Cameron', '16/8/1954'),
	(2, 'Quentin', 'Tarantino', '27/3/1963'),
	(3, 'James', 'Moron', '13/5/1985'),
	(4, 'Chris', 'Columbus', '10/09/1958');
	
INSERT INTO public.film(
	id, director_id, name, release_date, genre)
	VALUES
	(1, 1, 'Avatar', 2009, 'fantastic'),
	(2,1, 'Titanic', 1997, 'romantic'),
	(3,1, 'The Terminator', 1984, 'action'),
	(4,1, 'Terminator 2: Judgment Day', 1991, 'action'),
	(5,2, 'Desperado', 1995, 'action'),
	(6,2, 'From Dusk Till Dawn', 1995, 'action'),
	(7,4, 'Harry Potter and the Chamber of Secrets', 1998, 'fantasy');