import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import { MoviePage } from 'types/movie';
import './styles.css'

type Props = {
    page: MoviePage;
    onChange: Function;
}

function Pagination({page, onChange}:Props) {
    return (
        <div className="plmovie-pagination-container">
            <div className="plmovie-pagination-box">
                <button className="plmovie-pagination-button" disabled={page.first} onClick={() => onChange(page.number--)} >
                    <Arrow />
                </button>
                <p>{`${page.number++} de ${page.totalPages}`}</p>
                <button className="plmovie-pagination-button" disabled={page.last} onClick={() => onChange(page.number++)} >
                    <Arrow className="plmovie-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;