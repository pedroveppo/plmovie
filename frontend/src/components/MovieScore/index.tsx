import MovieStars from "components/MovieStars/Index";
import './styles.css';

type Props = {
    score: number;
    count: number;
}
function MovieScore( { score, count} : Props) {

    return (
        <div className="plmovie-score-container">
            <p className="plmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars score={score}/>
            <p className="plmovie-score-count">{count} avaliações</p>
        </div>
    );
}

export default MovieScore;